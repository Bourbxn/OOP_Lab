class Queue{
    private int[] elements;
    private int[] temp;
    private int size;
    private int pointer;

    public Queue(){
        this.size = 8;
        this.pointer = 0;
        elements = new int[this.size];
    }

    //setter

    public void setSize(int size){
        this.size = size;
    }

    //getter

    public boolean empty(){
        if(pointer==size){
            return false;
        }
        else {
            return true;
        }
    }

    public int getSize(){
        return size;
    }

    //method
    public void enqueue(int v){
        if(pointer!=size){
            elements[pointer] = v;
        }
        else{
            temp = new int[size];
            for(int i=0;i<size;i++){
                temp[i] = elements[i];
            }
            size++;
            elements = new int[size];
            for(int i=0;i<size;i++){
                if(i!=size-1) elements[i] = temp[i];
                else elements[i] = v;
            }
        }
        pointer++;
    }

    public void dequeue(){
        temp = new int[size];
        for(int i=0;i<size;i++){
            temp[i] = elements[i];
        }
        elements = new int[size];
        for(int i = 0;i<size-1;i++){
            elements[i] = temp[i];
        }
        pointer--;
    }

    public void displayQueue(){
        System.out.println("Queue: ");
        if(pointer==0){
            System.out.println("No elements");
        }
        else{
            for(int i=0;i<pointer;i++){
                System.out.println(elements[i]);
            }
        }
        System.out.println("------------");
    }
}