package ui.main

import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.jetpack.demo.R
import com.jetpack.demo.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import ui.checkin.fragment.CheckInFragment
import ui.news.fragment.NewsFragment
import ui.inbox.fragment.InboxFragment
import ui.portfolio.fragment.PortfolioFragment
import utils.constant.replaceFragment
import utils.constant.showToast


@AndroidEntryPoint
class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        /**
         * Toolbar
         */
        val toolbar: Toolbar = binding.appBarMain.toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.title = ""
        supportActionBar?.setDisplayHomeAsUpEnabled(false)
        supportActionBar?.setHomeButtonEnabled(false)
        /**
         * Drawer
         */
        drawer = binding.drawerLayout
        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer.addDrawerListener(toggle)
        binding.navView.setNavigationItemSelectedListener(this)


        bottomNavigationView= binding.bottomNavigationView
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.news_menu_item -> {
                    val fragment = NewsFragment.newInstance()
                    replaceFragment(fragment, NewsFragmentTAG)
                    true
                }
                R.id.checkin_menu_item -> {
                    val fragment = CheckInFragment.newInstance()
                    replaceFragment(fragment, CheckInFragmentTAG)
                    true
                }
                R.id.inbox_menu_item -> {
                    val fragment = InboxFragment.newInstance()
                    replaceFragment(fragment, InboxFragmentTAG)
                    true
                }
                R.id.portfolio_menu_item -> {
                    val fragment = PortfolioFragment.newInstance()
                    replaceFragment(fragment, PortfolioFragmentTAG)
                    true
                }
                R.id.more_menu_item -> {
                    // If navigation drawer is not open yet, open it else close it.
                    if(!drawer.isDrawerOpen(GravityCompat.END)) {
                        drawer.openDrawer(GravityCompat.END)
                    }
                    else {
                        drawer.closeDrawer(GravityCompat.END)
                    }
                    true
                }
                else -> false
            }
        }

        var badgeInbox = bottomNavigationView.getOrCreateBadge(R.id.inbox_menu_item)
        badgeInbox.isVisible = true
        badgeInbox.number = 93

        var badgeMore = bottomNavigationView.getOrCreateBadge(R.id.more_menu_item)
        badgeMore.isVisible = true

        // When we open the application first time the fragment should be shown to the user in this case it is news fragment
        val newsFragment = NewsFragment.newInstance()
        replaceFragment(newsFragment, NewsFragmentTAG)

    }

    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onPostCreate(savedInstanceState, persistentState)
        toggle.syncState()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        toggle.onConfigurationChanged(newConfig)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        val fragment: Fragment?

        when (id) {
            R.id.nav_news -> {
                fragment = NewsFragment.newInstance()
                replaceFragment(fragment, NewsFragmentTAG)
            }
            R.id.nav_checkin -> {
                fragment = CheckInFragment.newInstance()
                replaceFragment(fragment, CheckInFragmentTAG)

            }
            R.id.nav_inbox -> {
                fragment = InboxFragment.newInstance()
                replaceFragment(fragment, InboxFragmentTAG)

            }
            R.id.nav_portfolio -> {
                fragment = PortfolioFragment.newInstance()
                replaceFragment(fragment, PortfolioFragmentTAG)

            }
            R.id.nav_profile -> {
                showToast(this, getString(R.string.profile), 0)

            }
            R.id.nav_logout -> {
                showToast(this, getString(R.string.logout), 0)

            }

        }
        if(!drawer.isDrawerOpen(GravityCompat.END)) {
            drawer.openDrawer(GravityCompat.END)
        }
        else {
            drawer.closeDrawer(GravityCompat.END)
        }
        binding.navView.setCheckedItem(id)
        return true
    }
    companion object{
        const val NewsFragmentTAG ="news"
        const val CheckInFragmentTAG ="checkin"
        const val InboxFragmentTAG ="inbox"
        const val PortfolioFragmentTAG ="portfolio"
        const val MoreFragmentTAG ="more"
    }
}