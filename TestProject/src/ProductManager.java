public class ProductManager {
    private ProductRepository repository;

    public ProductManager(ProductRepository repository){
        this.repository = repository;
    }

    public void add(Product product){
        repository.save(product);
    }

    public Product[] searchBy(String text){
        Product[] searchList = new Product[0];

        Product[] products = repository.findAll();

        for(int i=0;i<products.length;i++){
            if(matches(products[i],text)){
                int length = searchList.length + 1;
                Product[] tmp = new Product[length];
                System.arraycopy(searchList, 0, tmp, 0, searchList.length);
                int lastIndex = tmp.length - 1;
                tmp[lastIndex] = products[i];
                searchList = tmp;
            }
        }

        return searchList;
    }

    public boolean matches(Product product, String search){
        if(product.getName().contains(search)){
            return true;
        }
        if(product instanceof Book){
            Book book = (Book) product;
            if(book.getAuthor().contains(search)){
                return true;
            }
            if(book.getTitle().contains(search)){
                return true;
            }
        }else if(product instanceof Smartphone){
            Smartphone smartphone = (Smartphone) product;
            if(smartphone.getBrand().contains(search)){
                return true;
            }
        }

        return false;
    }

}
