package perceptron;

public class Perceptron_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nu[] = {0.9, 0.6};
		Perceptron_lib plib = new Perceptron_lib(2, nu, 0.01, 0.5);

		
		double input[][] = { {1,1}, {1,0}, {0,1}, {0,0}};
        double output[] = {1, 0, 0, 0};
       
       
        int index;
        for(int i = 0; i < 200; i++){
         index = (int)(Math.random()*4); 
         plib.getParameter(input[index], output[index]);
         System.out.println("index : "+i+"nu = "+nu[0]+", "+nu[1]);
        }
 
	   for(int i = 0; i < output.length; i++){
        if(plib.getOutput(input[i]) == output[i])
		System.out.println("Correct! : input("+input[i][0]+","+input[i][1]+") to output("+output[i]+")");
		else System.out.println("Miss! : input("+input[i][0]+","+input[i][1]+") to output("+output[i]+")");
		}
		System.out.println("Check : nu = "+nu[0]+", "+nu[1]);
}
}
//学習データのoutputをAND演算の値である1,0,0,0に変えた。nuが0.35,0.2のままでは⊿nuが0になりnuの値は変化しなかったがnuを0.9,0.6にすると
//nuがだんだん変化していく過程が見られた。
