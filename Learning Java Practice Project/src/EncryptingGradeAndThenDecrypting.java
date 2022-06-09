public class EncryptingGradeAndThenDecrypting {
    
public static void main(String[] args) {
    
    char grade = 'B';
    grade = (char) (grade + 8);

    System.out.println("This is encrypted grade : "+ grade);

    grade = (char) (grade - 8);

    System.out.println("This is decrypted grade : "+ grade);

}
}
