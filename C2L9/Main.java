
public class Main {
 public static void main(String[] args) {

  MinString3Heap heap = new MinString3Heap();
  heap.insert("Kemal");
  heap.insert("Zerrin");
  heap.insert("Ahmet");
  heap.insert("Beril");
  heap.insert("Canan");
  heap.insert("Hikmet");
  heap.insert("Okan");
  heap.update(2, "Mehmet");
  heap.update(4, "Fatih");
  heap.delete(2);
  heap.print();

 }
}