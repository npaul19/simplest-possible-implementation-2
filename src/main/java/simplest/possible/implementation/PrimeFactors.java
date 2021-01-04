package simplest.possible.implementation;

import com.google.common.collect.Lists;

import java.util.List;

public class PrimeFactors {

    public List<Integer> of(int n) {
        List<Integer> factors = Lists.newArrayList();
        if (n > 1) {
            factors.add(2);
        }
        return factors;
    }
}
