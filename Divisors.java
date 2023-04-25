class Divisors{
public static void main(String[] args){

Divisors d= new Divisors();
d.divisible(156);
d.count(142);
d.prime(131);

}
void divisible(int no){
int div=2;
while(div<no){

if(no%div==0){
System.out.println(div);
}
div++;
}
}

void count(int no){
int div=2;
int count=0;
while(div<no){

if(no%div==0){
System.out.println(div);
count++;

}

div++;

}

System.out.println("no of count  "+count);
}
void prime(int no){
int div=2;
int count=0;
while(div<no){
if(no%div==0){
count++;
}
div++;
}
if(count==0){
System.out.println("its prime");

}else{
System.out.println("its not primt");
}


}





}
