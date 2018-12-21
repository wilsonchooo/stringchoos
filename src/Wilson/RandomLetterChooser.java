package Wilson;

public class RandomLetterChooser extends RandomStringChooser{

    public RandomLetterChooser(String str){
        super(getSingleLetters(str));

    }

    public static String[] getSingleLetters(String str){
        String[] newArr  = new String[str.length()];
        for(int i = 0 ; i < str.length();i++){
            newArr[i] = str.substring (i,i+1);
        }
        return newArr;
    }


}
