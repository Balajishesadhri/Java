class Looping_first_4{

public static void main(String[] args){

Looping_first_4 li= new Looping_first_4();

//li.print_1();
//li.print1to5();
li.add();
li.mul();
}
void print_1(){
int i=1;
while(i<=5){
System.out.print("1 ");
i++;
}
System.out.println();

}
void print1to5(){
int i=1;
while(i<=5){

System.out.println(i);
i++;
}
}
void add(){
int i=1;
int count=1;
while(i<=5){

System.out.print(count+" ");
count+=2;
i++;

}
System.out.println();
}
void mul(){
int i=1;
int count=3;
while(i<=5){
count*=i;
System.out.print(count+" ");
i++;
count=3;

}

System.out.println();


}

}


























