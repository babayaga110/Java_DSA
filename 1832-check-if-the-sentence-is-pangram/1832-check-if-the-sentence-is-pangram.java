class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){return false;}
	
     String alphabets = "abcdefghijklmnopqrstuvwxyz";   
	 
   
    for( char ch :  alphabets.toCharArray()){
        if(sentence.indexOf(ch)==-1) return false;
    }
	
    return true;
    }
}