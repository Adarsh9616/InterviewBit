public class Solution {
   // This class helps in binding the height of people in queue with what is desired/required at that position.
    public class Person {
        public final int height;
        public final int count;

        public Person(int h, int c) {
            height = h;
            count = c;
        }
    }
    public ArrayList<Integer> order(ArrayList<Integer> heights, ArrayList<Integer> infronts) {
        Person[] persons = new Person[heights.size()];
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person(heights.get(i), infronts.get(i));
        }
        Arrays.sort(persons, (p1, p2) ->  {
            return Integer.compare(p2.height, p1.height);
        });
        // here is the crux of algo: To satisfy the required inFronts, Now go & place the elemnts at their index(count) 
        for (int i = 0; i < persons.length; i++) {
            res.add(persons[i].count, persons[i].height);
        }
        return res;                    
    }
}
