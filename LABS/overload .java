class Overload
{
static void address(int p)
{
System.out.println("pincode:" +p);
}
static void address(int p,String ps)
{
System.out.println("pincode:"+p+"police station:"+ps);
}
static void address(int p,String ps,String as)
{
System.out.println("pincode:"+p+"police station:"+ps+"assembly:"+as);
}
public static void main(String args[])
{
address(421505);
address(421505,"ambernath");
address(421505,"ambernath","assembly");
}
}

 