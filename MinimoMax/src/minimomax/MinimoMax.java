package minimomax;
public class MinimoMax {
    public static void main(String[] args) {

        int nums[] = {99, -100, 18, 89, 10, 54, 365, 254, 145, 9841};
        int min, max;
        
        min = max = nums[0];

        for(int i = 1; i < 10; i++){
            if (nums[i] < min) 
                min = nums[i];
            if (nums[i] > max)
                max = nums[i];                      
        }
        System.out.print("O min e o máx são: " + min + " e " + max);
    }
}
