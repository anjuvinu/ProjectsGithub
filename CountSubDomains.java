
//Input: cpdomains = ["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
//Output: ["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org",
// "1 intel.mail.com","951 com"]
//Explanation: We will visit "google.mail.com" 900 times,
// "yahoo.com" 50 times, "intel.mail.com" once and "wiki.org" 5 times.
// For the subdomains,we will visit "mail.com" 900 + 1 = 901 times,
// "com" 900 + 50 + 1 = 951 times, and "org" 5 times.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountSubDomains{
    public static List<String> countSubDomains(String[] cpdomains){
        HashMap<String, Integer> domainCounts = new HashMap<>();
        for(String domain: cpdomains){
            String[] countParts = domain.split(" ") ;
            int count = Integer.parseInt(countParts[0]);
            String fullDomain = countParts[1];
            
            for(int i=0;i<fullDomain.length();i++){
                    if(fullDomain.charAt(i)=='.'  || i==0){
                        String subDomain;
                    if(i==0){
                        subDomain = fullDomain;
                        //System.out.println("if i==0"+subDomain);
                        }
                        else{
                            subDomain = fullDomain.substring(i+1);
                            
                    }
                   // System.out.println(subDomain);
                    domainCounts.put(subDomain, domainCounts.getOrDefault(subDomain, 0) + count);
 
            }

        }
        }
        List<String> result = new ArrayList<>(); 
        domainCounts.entrySet().stream()
                .map(entry -> entry.getValue() + " " + entry.getKey())
                .forEach(result::add);
        return result;
        



    }

    public static void main(String[] args){

        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
           
         List<String> count = countSubDomains(cpdomains);
 System.out.println(count);
    }



}
