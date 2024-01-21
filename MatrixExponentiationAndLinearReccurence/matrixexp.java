package MatrixExponentiationAndLinearReccurence;
import java.util.*;

class matrix{
    ArrayList<ArrayList<Integer>> mat;
    int sz;
    matrix(int _sz){
        mat=new ArrayList<ArrayList<Integer>>(sz);
        for(int i=0;i<sz;i++){
            for(int j=0;j<sz;j++){
                mat.get(i).add(0);
            }
        }
        sz=_sz;
    }

    void identity(){
        for(int i=0;i<sz;i++){
           
                mat.get(i).set(i,1);
            
        }

    }

    matrix multiply(matrix a,matrix b){

        matrix res=new matrix(sz);
        res.identity();


        for(int i=0;i<sz;i++){
            for(int j=0;j<sz;j++){
                for(int k=0;k<sz;k++){
                    res.mat.get(i).set(j,(res.mat.get(i).get(j))+((a.mat.get(i).get(k))*(b.mat.get(k).get(j))));
                }
            }
        }

        return res;
    }





}
public class matrixexp {
    static void power(matrix a,int sz){
        matrix res=new matrix(sz);
        while(sz>0){
            if()
        }
    }
    public static void main(String args[]){

    }
}
