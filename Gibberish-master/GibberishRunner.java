

public class GibberishRunner extends Gibberish
{
    public static void main(){
        String wordlist5000;
        WordList5000 wordList5000 = new WordList5000();
        Gibberish gibberish = new Gibberish();
        
        
        System.out.println(gibberish.makeGibberish(wordList5000));
        
    }
}
