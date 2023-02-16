package java_Set.sieve;

import java.util.BitSet;

/**
 * @ClassName Sieve
 * @Description This program runs the Sieve of Erathostenes benchmark, It computes all primes up to 2000000
 * @Author long
 * @Date 2022/12/15 11:40
 * @Version 1.0
 *
 *
 * （1）先把1删除（现今数学界1既不是质数也不是合数）
 *
 * （2）读取队列中当前最小的数2，然后把2的倍数删去
 *
 * （3）读取队列中当前最小的数3，然后把3的倍数删去
 *
 * （4）读取队列中当前最小的数5，然后把5的倍数删去
 *
 * （5）读取队列中当前最小的数7，然后把7的倍数删去
 *
 * （6）如上所述直到需求的范围内所有的数均删除或读取
 **/
public class Sieve {
    public static void main(String[] args) {
        int n = 2000000;
        long start = System.currentTimeMillis();
        BitSet bitSet = new BitSet(n + 1);
        int count = 0;
        int i ;
        for (i = 2; i<=n; i++){
            bitSet.set(i);//将所有的位置设置为开状态
        }
        i = 2;

        while (i * i <= n){
            if (bitSet.get(i)){
                count++;
                int k = 2*i;
                while(k<=n){
                    bitSet.clear(k);//将2倍数设置为“关状态”,i的倍数
                    k += i;
                }
            }
            i++;

        }
        while (i <= n){
            if (bitSet.get(i)){
                count ++ ;
            }
            i++;
        }
        long end = System.currentTimeMillis();
        System.out.println(count + " primes");
        System.out.println((end - start) + " milliseconds");

    }
}
