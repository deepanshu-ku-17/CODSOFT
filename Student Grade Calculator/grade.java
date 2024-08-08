// students grade calculator



import java.util.*;
public class grade 
{
    public static void main(String[] args) 
    {
        float TotalMark = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int TotalSubject = scanner.nextInt();
        for(int i=0; i<TotalSubject; i++)
        {
            System.out.println("Enter the "+(i+1) +" subject marks (out of 100):");
            TotalMark += scanner.nextFloat();
        }
        float Percentage;
        Percentage=(TotalMark/TotalSubject);
        System.out.println("total marks: "+(TotalMark));
        System.out.println("percentage: "+(Percentage));
        if (Percentage >=90) 
        {
            System.out.println("Grade A+");
        }
        else if (Percentage >=85&& Percentage < 90)
        {
            System.out.println("Grade A");
        }
        else if (Percentage >=80&& Percentage < 85)
        {
            System.out.println("Grade B+");
        }
        else if (Percentage >=75&& Percentage < 80)
        {
            System.out.println("Grade B");
        }
        else if (Percentage >=70&& Percentage < 75)
        {
            System.out.println("Grade C");
        }
        else if (Percentage >=60&& Percentage < 70)
        {
            System.out.println("Grade D");
        }
        else if (Percentage >=50&& Percentage < 60)
        {
            System.out.println("Grade E");
        }
        else if (Percentage < 50)
        {
            System.out.println("Grade F");
        }
        scanner.close();
    }
}
