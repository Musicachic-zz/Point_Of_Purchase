package pottst1.data;

/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 2/3/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

public class ProductList
{
	public Product[] getProducts()
	{
		Product[] products = new Product[4];

		products[0] = new Product();
		products[0].setUpc("12345678");
		products[1] = new Product();
		products[1].setUpc("87654321");
		products[2] = new Product();
		products[2].setUpc("11111111");
		products[3] = new Product();
		products[3].setUpc("222222222");

		return products;
	}
}
