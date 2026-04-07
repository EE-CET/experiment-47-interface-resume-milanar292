import java.util.Scanner;

interface Resume {
    void biodata();
}

class Teacher implements Resume {
    String name;
    String qualification;
    int experience;

    // Implement biodata()
    public void biodata() {
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Experience: " + experience + " years");
    }
}

public class InterfaceResume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Teacher t = new Teacher();
        
        // Read input
        t.name = sc.nextLine();
        t.qualification = sc.nextLine();
        t.experience = sc.nextInt();
        
        // Call method
        t.biodata();
    }
}
