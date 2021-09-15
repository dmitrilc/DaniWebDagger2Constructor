import com.example.Store
import com.example.component.DaggerStoreComponent

fun main(){
    val store: Store = DaggerStoreComponent.create().store()
    println(store.employee)
    println(store.manager)
}