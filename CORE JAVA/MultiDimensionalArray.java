public class MultiDimensionalArray {
public static void main(String[] args) {
    
    int nums[][] = new int[3][4];

    for (int i = 0; i < 3.; i++) {
        for (int j = 0; j < 4; j++) {
            nums[i][j] = (int)(Math.random() * 10);
            System.out.print(nums[i][j] + " ");
        }
        System.out.println();
    }

    for(int n[] : nums){
        for(int m : n){
            System.out.print(m + " ");
        }
        System.out.println();
    }

    // JAGGED ARRAY
    int nums2[][] = new int[3][]; //(jagged array -> size not specified)

        
        nums2[0] = new int[3];
        nums2[1] = new int[4];
        nums2[2] = new int[2];

        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[i].length; j++) {
                nums2[i][j] = (int)(Math.random() * 100);
            }
        }

        for (int x[] : nums2) {
            for (int y[]  : x) {
                System.out.print(y);
            }
            System.out.println();
            
        }

        //DRAWBACKS

        // -> Size fixed
        // -> We have to specify everything
        // -> Same type of data can only be allocated

}

}
