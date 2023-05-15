import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.printf("Nhap vao ten muon tim: ");
        String inputName = input.next();
        boolean isExist = false;
        for (int i = 0; i < student.length; i++){
            if(inputName.equals(student[i])){
                isExist = true;
                break;
            }
        }
        System.out.println(isExist);
        if(isExist){
            System.out.println(inputName + " co trong danh sach hoc sinh");
        }else {
            System.out.println(inputName + " khong co trong danh sach");
        }
    }
}