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
	public Product[] products;

	public ProductList()
	{

	}

	public Product[] getProducts()
	{
		products[0].setUpc("12345678");
		products[1].setUpc("87654321");
		products[2].setUpc("11111111");
		products[3].setUpc("222222222");

		return products;
	}
}
