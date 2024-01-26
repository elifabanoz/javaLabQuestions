public class MinString3Heap {
    private String[] values;
    private int N = 0;

    public MinString3Heap() {
        this.values = new String[20];
    }

    public void insert(String value) {
        if(N>=values.length-1){
            String[] newValues=new String[values.length*2];
            System.arraycopy(values,0,newValues,0,values.length);
            values=newValues;
        }
        values[++N]=value;
        swimRecursive(N);
    }

    private void swimRecursive(int index) {
      if(index>1){
          int parent=(index-2)/3 +1;

          if(values[index].compareTo(values[parent])<0){
              swap(index,parent);
              swimRecursive(parent);
          }
      }
    }

    public String removeMin() {
        if(N==0){
            return null;
        }
        String minValue=values[1];
       swap(1,N--);
        sinkRecursive(1);
        return minValue;

    }

    private void sinkRecursive(int index) {
      int minChild=minChild(index);

      if(minChild!=-1 && values[index].compareTo(values[minChild])>0){
          swap(index,minChild);
          sinkRecursive(minChild);
      }


    }
    private int minChild(int index){
        int firstChild=3*index-1;
        if(firstChild>N){
            return -1;
        }
        int minChildIndex=firstChild;
        int lastChild=Math.min(firstChild+2,N);

        for(int i=firstChild+1;i<=lastChild;i++){
            if(values[i].compareTo(values[minChildIndex])<0){
                minChildIndex=i;
            }
        }
        return minChildIndex;
    }

    public void delete(int index) {
       if(index>0 && index<=N){
           values[index]=values[N--];
           swimRecursive(index);
           sinkRecursive(index);
       }
    }

    public void update(int index, String newValue) {
        if(index>0 && index<=N){
            values[index]=newValue;
            swimRecursive(index);
            sinkRecursive(index);
        }
    }

    public void print() {
        for (int i = 1, _N = N; i <= _N; i++) {
            System.out.println(removeMin());
        }
    }
    private void swap(int i, int j){
        String temp=values[i];
        values[i]=values[j];
        values[j]=temp;
    }
}
