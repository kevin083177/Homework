public class Main{  
    public static void main(String[] args) {  
        String text = "TestSting";  
        System.out.println(text);  
        System.out.println(text.length());  
        System.out.println(text.charAt(2));  
        System.out.println(text.toUpperCase());  
        System.out.println(text.toLowerCase());  
        System.out.println(text.substring(2));  
        System.out.println(text.substring(1,3));  
        System.out.println(text.replace("g", "G"));  
        System.out.println(text.concat("Add"));  
    }
}