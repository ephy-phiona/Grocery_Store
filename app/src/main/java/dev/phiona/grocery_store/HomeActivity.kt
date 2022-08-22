package dev.phiona.grocery_store

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.phiona.grocery_store.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupBottom()
        castView()
    }
    fun castView(){
//        bnvHome=findViewById(R.id.bottom_navigation)
//        fvcHome=findViewById(R.id.fcvHome)
    }
    fun setupBottom(){
        binding.bottomNavigation.setOnItemReselectedListener { item->
            when(item.itemId){             // Plan
                R.id.home ->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome,HomeFragment()).commit()
                    true
                }
                R.id.cart ->{             //Track
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome,CartFragment()).commit()
                    true
                }
                R.id.profile->{                //Profile
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome,ProfileFragment()).commit()
                    true
                }
                else -> false
            }


        }
    }
}


