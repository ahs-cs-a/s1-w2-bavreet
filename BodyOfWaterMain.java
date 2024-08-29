public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater(n:"lake tahoe, 20, 60, true");
        BodyOfWater b1 = new BodyOfWater(erfan, 70, 300, false);
        b.setname("lake xxx");
        b.setavgDpeth(80);
        b.setlongestDiameter(100);
        b.setisSalt(false);
        System.out.println(b.getname());
        System.out.prinyln(b.getavgDepth());
        System.out.println(b.getlargestDiameter());
        System.out.println(b.getisSalt());
        System.out.println(b1.getname());
        System.out.println(b1.getavgDepth());
        
    }
}
