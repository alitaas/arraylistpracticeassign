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

        //11. Find Common Elements
        ArrayList<String> country1 = new ArrayList<>();
        country1.add("Brazil");
        country1.add("Estonia");
        country1.add("Zimbabwe");
        country1.add("Kyrgyzstan");

        ArrayList<String> country2 = new ArrayList<>();
        country2.add("Brazil");
        country2.add("Romania");
        country2.add("New Zealand");
        country2.add("Kyrgyzstan");

        ArrayList<String> commonCountries = new ArrayList<>();

        for (String country : country1) {
            if (country2.contains(country)) {
                commonCountries.add(country);
            }
        }
        System.out.println();
        System.out.println("Countries list #1: " + country1);
        System.out.println("Countries list #2: " + country2);
        System.out.println("Common countries: " + commonCountries);

        //12. Remove Even-Length Strings
        ArrayList<String> names = new ArrayList<>();
        names.add("Alita");
        names.add("Mark");
        names.add("Joshua");
        names.add("Evelynn");
        names.add("Kai");
        names.add("Adilya");

        System.out.println();
        System.out.println("Names: " + names);

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() % 2 == 0) {
                names.remove(i);
                i--;
            }
        }

        System.out.println("Updated list: " + names);

        //13. Find Smallest Element
        ArrayList<String> songs = new ArrayList<>();
        songs.add("like Jennie");
        songs.add("Qaragat");
        songs.add("All for us");
        songs.add("Shut Down");
        songs.add("С тобой");
        songs.add("number one girl");

        String shortest = songs.get(0);
        for (String song : songs) {
            if (song.length() < shortest.length()){
                shortest = song;
            }
        }

        System.out.println();
        System.out.println("Songs: " + songs);
        System.out.println("Shortest song name: ");
        System.out.println(shortest);
        System.out.println("Length: " + shortest.length());

        //14. Replace All Vowels
        ArrayList<String> words = new ArrayList<>();
        words.add("book");
        words.add("programming");
        words.add("sapat");
        words.add("university");
        words.add("perfume");

        System.out.println();
        System.out.println("Words: " + words);

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            String newWord = "";

            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    newWord += "*";
                } else {
                    newWord += ch;
                }
            }

            words.set(i, newWord);
        }

        System.out.println("Updated list: " + words);

        //15. Partition ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(313);
        numbers.add(52);
        numbers.add(4000);
        numbers.add(90);
        numbers.add(67);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);

            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }

        System.out.println();
        System.out.println("Numbers: " + numbers);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);

        //16. Rotate Elements
        ArrayList<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        int positions = 2; // number of positions to rotate

        // Rotate to the right
        for (int i = 0; i < positions; i++) {
            String lastday = days.remove(days.size() - 1); // remove last element
            days.add(0, lastday); // add it at the beginning
        }

        System.out.println();
        System.out.println("Days after rotation: " + days);

        //17. Remove Null Values
        ArrayList<String> studnames = new ArrayList<>();
        studnames.add("Albina");
        studnames.add("Aiperi");
        studnames.add(null);
        studnames.add("Aida");
        studnames.add(null);

        System.out.println();
        System.out.println("Student names: " + studnames);

        for (int i = 0; i < studnames.size(); i++) {
            if (studnames.get(i) == null) {
                studnames.remove(i);
                i--; // move index back after removal
            }
        }

        System.out.println("Students list without nulls: " + studnames);

        //18. Find Second Largest Element
        ArrayList<String> movies2 = new ArrayList<>();
        movies2.add("The Umbrella Academy");
        movies2.add("Stranger Things");
        movies2.add("Avengers");
        movies2.add("Interstellar");

        if (movies2.size() < 2) {
            System.out.println("Not enough movies to find the second largest.");
            return;
        }

        String largest = "";
        String secondLargest = "";

        for (int i = 0; i < movies2.size(); i++) {
            String movie = movies2.get(i);

            if (movie.length() > largest.length()) {
                secondLargest = largest;
                largest = movie;
            } else if (movie.length() > secondLargest.length() && movie.length() < largest.length()) {
                secondLargest = movie;
            }
        }

        System.out.println();
        System.out.println("Movies list: " + movies2);
        System.out.println("Second largest movie title: " + secondLargest);

        //19. Replace Elements with Lengths
        ArrayList<String> fruits2 = new ArrayList<>();
        fruits2.add("Apple");
        fruits2.add("Banana");
        fruits2.add("Mango");
        fruits2.add("Pineapple");

        System.out.println();
        System.out.println("Fruits: " + fruits2);

        // Loop through the list and replace each fruit with its length
        for (int i = 0; i < fruits2.size(); i++) {
            int length = fruits2.get(i).length();
            fruits2.set(i, String.valueOf(length)); // convert int to String
        }

        System.out.println("Fruits replaced by their lengths: " + fruits2);

        //20. Create Nested ArrayList
        System.out.println();
        ArrayList<String> itDepartment = new ArrayList<>();
        itDepartment.add("Alice");
        itDepartment.add("Bob");
        itDepartment.add("Charlie");

        ArrayList<String> hrDepartment = new ArrayList<>();
        hrDepartment.add("David");
        hrDepartment.add("Eva");

        ArrayList<String> salesDepartment = new ArrayList<>();
        salesDepartment.add("Frank");
        salesDepartment.add("Grace");
        salesDepartment.add("Hannah");

        // Create an ArrayList of ArrayLists
        ArrayList<ArrayList<String>> company = new ArrayList<>();
        company.add(itDepartment);
        company.add(hrDepartment);
        company.add(salesDepartment);

        for (int i = 0; i < company.size(); i++) {
            ArrayList<String> department = company.get(i);
            System.out.println("Department " + (i + 1) + ": " + department);
        }


    }
}