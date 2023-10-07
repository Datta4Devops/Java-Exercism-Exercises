class PrimeCalculator {
    private int[] primeNumbersArray;

    PrimeCalculator() {
        primeNumbersArray = new int[10002];
        int index = 0;
        for (int i = 2; i < 10000000; i++) {
            if (index >= 10002) break;
            boolean flg = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flg = false;
                    break;
                }
            }
            if (flg) primeNumbersArray[index++] = i;
        }
    }

    int nth(int nth) {
        if(nth <=0 )    throw new IllegalArgumentException();
        return primeNumbersArray[nth-1];
    }

}
