import java.util.*;

class PythagoreanTriplet {

    private int a, b, c;
    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean equals(Object that) {    // it overides equals method when assertThat method uses isEqualTo for comapring two objects or lists.
        if (!(that instanceof PythagoreanTriplet))
            return false;
        return a == ((PythagoreanTriplet) that).a &&
                b == ((PythagoreanTriplet) that).b &&
                c == ((PythagoreanTriplet) that).c;
    }
    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();
    }

    static class TripletListBuilder {
        int maxFactor = 0;
        int sum;

        TripletListBuilder thatSumTo(int sum) {
            this.sum = sum;
            if(maxFactor == 0)  maxFactor = sum;
            return this;
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            return this;
        }

        List<PythagoreanTriplet> build() {

            List<PythagoreanTriplet> tripletsList  = new ArrayList<>();
            for (int a = 1; a < maxFactor; a++) {
                for (int b = a + 1; b < maxFactor; b++) {
                    double c = Math.sqrt(a * a + b * b);
                    if (c > maxFactor) break;
                    int val = (int) Math.round(c);
                    if (c == (double) val) {
                        if ((a + b + val) == this.sum)
                        {
                            tripletsList.add(new PythagoreanTriplet(a, b, val));
                        }
                    }
                }
            }

            return tripletsList;
        }

    }

}