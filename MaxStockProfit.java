public class MaxStockProfit {
    
    public static void main(String[] args){
        System.out.println(maxStockProfit(new int[]{10, 18, 4, 5, 9, 6, 16, 12}));
        System.out.println("==================");
        System.out.println(maxStockProfit(new int[]{32,46,26,38,40,48,42}));
    }

    public static int maxStockProfit(int[] arr){ 
        
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i < arr.length;i++){
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int resultado = max - min;
        if (resultado <= 0) {
            return -1;
        }else {
            return resultado;
        }
        
    }
}
