    public static int makeAnagram(String a, String b) {

    int deletedNumber = 0;
    ArrayList<String> anagramOne = new ArrayList<>(Arrays.asList(a.split("")));
    ArrayList<String> anagramTwo = new ArrayList<>(Arrays.asList(b.split("")));


    for(String readerOne: anagramOne){

            if(anagramTwo.contains(readerOne)){
                anagramTwo.remove(readerOne);

             } else {
                deletedNumber++;

        }
    }
    for(String readerTwo: anagramTwo){


                deletedNumber++;


    }
        return deletedNumber;
    }

}