package package13;

import java.util.StringTokenizer;

public class Adress {
    public String country;
    public String region;
    public String city;
    public String street;
    public String house;
    public String block;
    public String flat;

    public Adress(String country, String region, String city, String street, String house, String block, String flat) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
        this.block = block;
        this.flat = flat;
    }

    public Adress(String s, boolean complex){
        if (!complex){
            String[] s1 = s.split(", ");
            this.country = s1[0];
            this.region = s1[1];
            this.city = s1[2];
            this.street = s1[3];
            this.house = s1[4];
            this.block = s1[5];
            this.flat = s1[6];
        }
        else {
            StringTokenizer st = new StringTokenizer(s);
            this.country = st.nextToken();
            this.region = st.nextToken();
            this.city = st.nextToken();
            this.street = st.nextToken();
            this.house = st.nextToken();
            this.block = st.nextToken();
            this.flat = st.nextToken();
        }
    }

}
