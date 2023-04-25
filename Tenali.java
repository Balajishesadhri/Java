class Tenali{
public static void main(String[] args){

Tenali story = new Tenali();
//story.find_security(1024);
//story.find_flower(7);
story.print_1();
}

void print_1(){
int count =1;
while(count<=5){
System.out.println(count);
count++;
}

}

void find_flower(int kovil){


int flower=1;
while(kovil>0){

kovil=kovil-1;
flower=flower*2;

}

System.out.println(flower);

}

void find_security(int beat){


int s=0;
while(beat>1){

beat=beat/2;
s=s+1;

}

System.out.println(s);
// System.out.println(Beat);
}

}
