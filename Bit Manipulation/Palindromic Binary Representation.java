public class Solution {
    public int number(int group_No, int aux, int op) {
        int ar[] = new int[32];
        // System.out.println("GP: "+group_No+" OP: " + op);
        int num = 0, len, i = 0;
        if(op == 2) {
            len = 2 * group_No;
            ar[len-1] = ar[0] = 1;
            while(aux > 0) {
                ar[group_No + i] = ar[group_No - 1 - i] = (aux & 1);
                aux = aux>>1;
                i++;
            }
        }
        else if(op == 0) {
            len = 2 * group_No + 1;
            ar[len - 1] = ar[0] = 1;
            ar[group_No] = 0;
            while(aux > 0) {
                ar[group_No + i + 1] = ar[group_No - 1 - i] = (aux & 1);
                aux >>= 1;
                i++;
            }
        }
        else {
            len = 2 * group_No + 1;
            ar[len-1] = ar[0] = 1;
            ar[group_No] = 1;
            while(aux > 0) {
                 ar[group_No + i + 1] = ar[group_No - 1 - i] = (aux & 1);
                 aux >>= 1;
                 i++;
            }
        }
        // System.out.println("Len : "+len);
        for (i = 0; i < len; i++) {
            // System.out.print(ar[i]+" ");
            num += (1 << i) * ar[i];
        }
        // System.out.println();
        return num;
    }
    
    public int solve(int A) {
        int group_No= 0 , countT = 1, count_until = 0;
        int op, aux;
        while(countT < A){
            group_No++;
            count_until = countT;
            countT += 3 * (1<<(group_No - 1));
        }
        int gp_of = A - count_until - 1;
        
        if( (gp_of+1) <= (1<<(group_No - 1)) ){
            op = 2;
            aux = gp_of;
        }
        else {
            if( ((gp_of+1)-(1<<(group_No - 1))) % 2 == 1) {
                op = 0;
            }
            else 
                op = 1;
            aux = ((gp_of)-(1<<(group_No - 1))) / 2;
        }
        return number(group_No, aux, op);
    }
}