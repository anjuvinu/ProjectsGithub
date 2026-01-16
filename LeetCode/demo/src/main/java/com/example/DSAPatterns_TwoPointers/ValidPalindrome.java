package DSAPatterns_TwoPointers;

public class ValidPalindrome {
    
    public boolean solution(String s){
        String noSpaces = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int  left = 0;
        int right = noSpaces.length()-1;

        while(left<=right){
                if(noSpaces.charAt(left)!=noSpaces.charAt(right)){
                    return false;
                }
                else{
                    left++;
                    right--;
                }
            
        }
        return true;
    }

    

    
}
