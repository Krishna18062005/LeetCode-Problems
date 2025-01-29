class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int c=0;
    // if(flowerbed[0]==0&&flowerbed[1]==0){
    //     c++;
    //     flowerbed[0]=1;
    // }
    
    for(int i=0;i<flowerbed.length;i++){
       int pr= ((i == 0) || (flowerbed[i - 1] == 0))?0:1;
       int cu=flowerbed[i];
       int ne=((i == flowerbed.length - 1) || (flowerbed[i + 1] == 0))?0:1;;
       if(pr==0&&cu==0&&ne==0){ c++;flowerbed[i]=1;}
    }
    return c>=n;
    }
}

            