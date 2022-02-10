package algorithm2.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 문자열 크로아티아 알파벳
//참고 https://st-lab.tistory.com/68
public class java_2941 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        //배열로 하니 ddz=z= 입력에서 두번째 d를 인식못함
        //String[] arr = s.split("");

        int count = 0;
        int len = s.length();

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'c' && i < len - 1) {
                if(s.charAt(i+1) == '=' || s.charAt(i+1) == '-') {
                    i++;
                }
            }

            else if (c == 'd' && i < len - 1) {
                if(s.charAt(i+1) == 'z' && i < len - 2) {
                    if(s.charAt(i+2) == '=') {
                        i += 2;
                    }
                }

                else if(s.charAt(i+1) == '-') {
                    i++;
                }
            }

            else if((c == 'l' || c == 'n') && i < len - 1) {
                if(s.charAt(i+1) == 'j') {
                    i++;
                }
            }

            else if ((c == 's' || c == 'z') && i < len - 1) {
                if(s.charAt(i+1) == '=') {
                    i++;
                }
            }

            count ++;
        }



        // for(int i=0; i<arr.length; i++) {
        //     System.out.println("i 1  " + i);
        //     System.out.println("arr[i]  " + arr[i]);
            
        //     if(i == (arr.length - 1)) {
        //         count++;
        //         break;
        //     }else if(i == arr.length) break;

        //     if(arr[i].equals("c") || arr[i].equals("s") || arr[i+1].equals("z")) {
                
        //         if(arr[i+1].equals("=") || arr[i+1].equals("-")) {
        //             i++;
        //             System.out.println("i 2  " + i);
        //         }
        //     } 

        //     else if (arr[i].equals("d")) {
        //         System.out.println("들어옴1 " + arr[i+1]);

        //         if(arr[i+1].equals("z")) {
        //             System.out.println("들어옴2 " + arr[i+2]);
        //             if(arr[i+2].equals("=")) {
        //                 System.out.println("들어옴3 ");
        //                 i += 2;
        //                 System.out.println("i 3  " + i);
        //             }
        //         }

        //         else if (arr[i+1].equals("-")) {
        //             i++;
        //             System.out.println("i 4  " + i);
        //         }
        //     }

        //     else if(arr[i].equals("l") || arr[i].equals("n")) {
        //         if(arr[i+1].equals("j")) {
        //             i++;
        //             System.out.println("i 5  " + i);
        //         }
        //     }

        //     count ++;
        //     System.out.println("count " + count);
        // }

        System.out.println(count);
    }

}
