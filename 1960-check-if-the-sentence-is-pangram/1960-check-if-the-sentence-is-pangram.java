class Solution {
    public boolean checkIfPangram(String sentence) {
        for (int i = 97; i <= 122; i++) {
            if(sentence.indexOf((char) i) == -1)
                return false;
        }
        return true; 
    }
}