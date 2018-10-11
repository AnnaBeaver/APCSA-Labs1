
public class Gibberish
{
    public Gibberish(){
    }
    public String sourceString;
    public String makeGibberish(WordList5000 wordlist5000){
        
        sourceString = new Template().getSourceString();
        //String sourceString = ("hi");
        boolean runloop = true;
        //int currentSourceIndex = 0;
        //String resultString = null;
        while(runloop == true){
             int currentSourceIndex = sourceString.indexOf("<");
             int finalIndex = sourceString.indexOf("</>")+3;
             String placeholderString = String.valueOf(sourceString.charAt(currentSourceIndex + 1));
             String randomWord = wordlist5000.getRandomWordString(placeholderString);
             if(currentSourceIndex > -1){
                 sourceString = sourceString.substring(0,currentSourceIndex) + randomWord + sourceString.substring(finalIndex);
             }
             else{
                 runloop = false;
             }
        }
        return sourceString;
    }  
}

