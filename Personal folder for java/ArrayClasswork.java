public class ArrayClasswork{
public static void main(String[] args){
int [] nums = {0,8,1,3,6,8};

int indexofi = 0;
int indexofj2 = 0;
int i = 0;
int j = 0;

for (i = 0; i < nums.length; i++){

for (j = nums.length - 1; j > i; j--){
if (nums[i] % nums[j] == 1){

indexofi = i;
indexofj2 = j;
System.out.println(nums[i]);
}
}
}
//System.out.println(indexofi);
//System.out.println(nums[i]);
//System.out.println(indexofj2);


}
}