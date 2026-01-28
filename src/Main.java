import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
                //1. merge unique elements
                ArrayList<String> books1 = new ArrayList<>();
                books1.add("Dune");
                books1.add("The Hobbit");
                books1.add("1984");

                System.out.print("List #1 of books: " + books1);

                ArrayList<String> books2 = new ArrayList<>();
                books2.add("Harry Potter");
                books2.add("Dune");
                books2.add("It ends with us");

                System.out.println();
                System.out.print("List #2 of books: " + books2);

                ArrayList<String> mergedBooks = new ArrayList<>();
                for (String book : books1){
                    mergedBooks.add(book);
                }

                for (String book : books2){
                    if (!mergedBooks.contains(book)){
                        mergedBooks.add(book);
                    }
                }
                System.out.println();
                System.out.println("Merged list without duplicates: ");
                for (String book : mergedBooks){
                    System.out.println(book);
                }

                //2.find maximum element

                ArrayList<String> movies = new ArrayList<>();
                movies.add("Harry Potter");
                movies.add("Zootopia");
                movies.add("Avatar");
                movies.add("Queen's gambit");

                String longest = movies.get(0);
                for (String movie : movies) {
                    if (movie.length() > longest.length()){
                        longest = movie;
                    }
                }
                System.out.println();
                System.out.println("2. Find maximum element.");
                System.out.println("Longest movie title: ");
                System.out.println(longest);
                System.out.println("Length: " + longest.length());

                //3. count occurances
                ArrayList<String> foods = new ArrayList<>();
                foods.add("ice cream");
                foods.add("pizza");
                foods.add("sushi");
                foods.add("pasta");
                foods.add("pizza");

                int count = 0;

                for (String food : foods) {
                    if (food.equals("pizza")){
                        count++;
                    }
                }
                System.out.println();
                System.out.println("3. Count occurrances.");
                System.out.println("Foods: " + foods);
                System.out.println("Pizza apears " + count + " times.");

                //4.remove all matching elements
                ArrayList<String> fruits = new ArrayList<>();
                fruits.add("banana");
                fruits.add("grape");
                fruits.add("mango");
                fruits.add("apple");
                fruits.add("orange");
                fruits.add("banana");
                System.out.println();
                System.out.println("4. Remove all matching elements.");
                System.out.println("Fruits: " + fruits);

                for (int i = 0; i < fruits.size(); i++){
                    if (fruits.get(i).equals("banana")){
                        fruits.remove(i);
                        i--;
                    }
                }
                System.out.println("Fruits list without banana: " + fruits);

                //5. replace all elements
                ArrayList<String> colors = new ArrayList<>();
                colors.add("red");
                colors.add("green");
                colors.add("navy blue");
                colors.add("yellow");
                colors.add("burgundy");

                System.out.println();
                System.out.println("5. Replace all elements.");
                System.out.println("Colors: " + colors);
                for (int i = 0; i < colors.size(); i++){
                    colors.set(i, "black");
                }

                System.out.println("Colors after replacement: " + colors);

                //6. Check sublist presence
                ArrayList<String> sports = new ArrayList<>();
                sports.add("volleyball");
                sports.add("figure skating");
                sports.add("football");
                sports.add("tennis");
                sports.add("golf");
                sports.add("cricket");
                System.out.println("Sports: " + sports);

                ArrayList<String> subsport = new ArrayList<>();
                subsport.add("football");
                subsport.add("tennis");
                System.out.println("Sublist: " + subsport);

                System.out.println();
                if (sports.containsAll(subsport)){
                    System.out.println("The sports list contains the sublist.");
                } else {
                    System.out.println("The sports list doesn't contain the sublist.");
                }

                //7.find index of element

                ArrayList<String> flowers = new ArrayList<>();
                flowers.add("lily");
                flowers.add("rose");
                flowers.add("tulip");
                flowers.add("sunflower");
                flowers.add("cactus");
                flowers.add("rose");

                int firstind = flowers.indexOf("rose");
                int lastind = flowers.lastIndexOf("rose");

                System.out.println();
                System.out.println("Flowers: " + flowers);
                System.out.println("First index of 'rose': " + firstind);
                System.out.println("Last index of 'rose': " + lastind);

                //8.remove duplicates
                ArrayList<String> animals = new ArrayList<>();
                animals.add("tiger");
                animals.add("lion");
                animals.add("whale");
                animals.add("cat");
                animals.add("dog");
                animals.add("lion");
                animals.add("dog");

                System.out.println();
                System.out.println("Animals: " + animals);

                ArrayList<String> uniqueanim = new ArrayList<>();
                for(String animal : animals){
                    if (!uniqueanim.contains(animal)){
                        uniqueanim.add(animal);
                    }
                }

                System.out.println("List without duplicates: " + uniqueanim);

                //9.convert arraylist to array
                ArrayList<String> cities = new ArrayList<>();
                cities.add("Bishkek");
                cities.add("Budapest");
                cities.add("Hong-Kong");
                cities.add("Beijing");
                cities.add("Tirana");
                System.out.println();
                System.out.println("Cities:" + cities);
                String[] citiyarray = new String[cities.size()];
                cities.toArray(citiyarray);

                System.out.println("City elements:" );
                for(int i = 0; i < citiyarray.length; i++){
                    System.out.println(citiyarray[i]);
                }
                //10. convert array to arraylist
                int[] numsarray = {1, 2, 3, 4, 5, 6};
                ArrayList<Integer> numlist = new ArrayList<>();

                for (int i = 0; i < numsarray.length; i++){
                    numlist.add(numsarray[i]);
                }
                System.out.println();
                System.out.println("ArrayList elements: ");
                System.out.println(numlist);
    }
}