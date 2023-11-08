
        public class StringBufferExample {
            public static void main(String[] args) {
                // Create a StringBuffer object with an initial capacity of 16 characters
                StringBuffer stringBuffer = new StringBuffer("Hello, ");
        
                // Append additional text to the StringBuffer
                stringBuffer.append("World!");
        
                // Insert text at a specific position
                stringBuffer.insert(7, "Java ");
        
                // Replace a portion of the text
                stringBuffer.replace(0, 5, "Hi");
        
                // Delete characters from the StringBuffer
                stringBuffer.delete(11,stringBuffer.length());
        
                // Get the final result as a String
                String result = stringBuffer.toString();
        
                System.out.println(result); // Output: "Hi, Java World"
                //to print any statement first convert stringbuffer toString() method and than print 
                //otherwise it generates an error...
                StringBuffer sb=new StringBuffer();
                sb.append("venkat ");
                sb.append(" chiru");
                System.out.println(sb.toString());

                //stringbuffer insert() method
                StringBuffer s = new StringBuffer("GeeksGeeks");

        // Inserting element and position as an arguments
        s.insert(5, "for");
        // Returns GeeksforGeeks
        System.out.println(s.toString());
 
        s.insert(0, 5);
        // Returns 5GeeksforGeeks
        System.out.println(s.toString());
 
        s.insert(3, true);
        // Returns 5GetrueeksforGeeks
        System.out.println(s.toString());
 
        s.insert(5, 41.35d);
        // Returns 5Getr41.35ueeksforGeeks
        System.out.println(s.toString());
 
        s.insert(8, 41.35f);
        // Returns 5Getr41.41.3535ueeksforGeeks
        System.out.println(s.toString());
 
        // Declaring and initializing character array
        char geeks_arr[] = { 'p', 'a', 'w', 'a', 'n' };
 
        // Inserting character array at offset 9
        s.insert(2, geeks_arr);
        // Returns 5Gpawanetr41.41.3535ueeksforGeeks
        System.out.println(s.toString());

            }
        }
