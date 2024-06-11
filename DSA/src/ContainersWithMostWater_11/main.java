import java.util.ArrayList;

//In l

class Solution {
    public int maxArea(int[] height) {
        ArrayList< Integer > A =new ArrayList<>();
        for (int i=0;i<height.length;i++){
            A.add(height[i]);
        }
        if (A == null)
            return 0;
        int n = A.size();
        int first = 0;
        int last = n - 1;
        int area = 0;
        while (first < last) {
            int width = last - first;
            // finds the area for the current window
            area = Math.max(area, Math.min(A.get(first), A.get(last)) * width);
            if (A.get(first).intValue() >= A.get(last).intValue())
                last--;
            else
                first++;
        }
        return area;


    }
}

// public class Solution {
//     public int maxArea(ArrayList < Integer > A) {

// }
// }