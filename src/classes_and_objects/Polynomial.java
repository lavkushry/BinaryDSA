//package classes_and_objects;
//
//public class Polynomial {
//    public int degree[]=new int[200];
//
//    public Polynomial(){
//        coefficient;
//    }
//    public void setCoefficient(int degree, int coeff) {
//        this.degree[degree] = coeff;
//    }
//    public void print(){
//        for(int i=0;i<200;i++)
//        {
//            if(degree[i]!=0)
//                System.out.print(degree[i] +  "x" + (i)+ " ");
//        }
//    }
//    public Polynomial add(Polynomial p){
//        for(int i=0;i<200;i++)
//        {
//            this.degree[i]=this.degree[i] + p.degree[i];
//        }
//        return this;
//
//    }
//    public Polynomial subtract(Polynomial p){
//        for(int i=0;i<200;i++)
//        {
//            this.degree[i]=this.degree[i]-p.degree[i];
//        }
//        return this;
//    }
//    public Polynomial multiply(Polynomial p){
//        int x[]=new int[200];
//        for(int i=0;i<200;i++)
//        {
//            for(int j=0;j<200;j++)
//            {
//                int deg=(i) + (j);
//                if(deg<200)
//                {
//                    x[deg]+=this.degree[i]*p.degree[j];
//                }
//            }
//        }
//        for(int i=0;i<200;i++)
//            this.degree[i]=x[i];
//        return this;
//    }
//
//
//}
