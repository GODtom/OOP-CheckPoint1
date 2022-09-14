public class A1083331_checkpoint1{

    //Description : To calculate the probability the target occurrence ,we provide the variable of mean,sigma, and target.
    static private double mean,sigma,target,zz,p,i;
    //Description : Implement the cumulative distribution function class as to calculate the cumulative normal distribution function (a.k.a cndf).
    static private CDF CDF;
    public static void main(String[] args) {

        //read in the mean
        mean=Double.valueOf(args[0]);
        //read in the sigma
        sigma=Double.valueOf(args[1]);
        //read in the target
        target=Double.valueOf(args[2]);


        /*********************************The TODO********************************
         *
         * TODO(1): This time, you have to keep tracking the value of putting target into the CDF as it decreasing until the value is lower(<) than 0.001.
         * Hint: We provide a method in CDF class to calculate probability. To implement it, you can use "cndf(x)" means calculating the cndf for x, which mean=0, and sigma=1.
         * Hint1: e.g: CDF.cndf(0) --->  0.5
         * Hint2: Before subtracting, you should print out the possibility and target in this term--> "P(x)="+possibility+",x="+target"
         * Hint3: Target should be subtracted from one each time.
         * Hint4: If you find the target that the probability is less than 0.001, you should print "Find!P(x)="+possibility+",x="+target"
         *
         **********************************The End of the TODO**************************************/

        /********************************************************************************************
         START OF YOUR CODE
         ********************************************************************************************/
        for(i=target;i<target+1;i--){
        p=CDF.cndf(normalize(mean,sigma,i));
                if(p<0.001){
                System.out.println("Find!P(x)="+p+",x="+i+"");
                break;
                  }
        System.out.println("P(x)="+p+",x="+i+"");
        }
        /********************************************************************************************
         END OF YOUR CODE
         ********************************************************************************************/

    }

    //Data Standardization
    static private double normalize(double mean,double sigma,double target){
        /*********************************The TODO********************************
         *
         * TODO(2):You need to standardize the target data.
         * Hint: z_score = (target_data - mean) / sigma
         *
         **********************************The End of the TODO**************************************/


        /********************************************************************************************
         START OF YOUR CODE
         ********************************************************************************************/
         zz=(target-mean)/sigma;
         return zz;
         /********************************************************************************************
         END OF YOUR CODE
         ********************************************************************************************/
    }




}

