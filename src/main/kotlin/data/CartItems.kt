package data
/*
 Step 10. 장바구니에 추가한 상품 관리
 */
object CartItems {
    private val mutableProducts = mutableMapOf<Product, Int>()
    val products: Map<Product, Int> = mutableProducts //read only

    fun addProduct(product: Product) {
        mutableProducts[product]?.let {
            mutableProducts[product] = it+1
        } ?: kotlin.run{
            mutableProducts[product] = 1
        }
    }
}