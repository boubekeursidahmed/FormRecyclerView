package dz.anpt.myformrecyclerview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dz.anpt.myformrecyclerview.model.User

class ItemAdapter(
    private val context: Context,
    private val dataset: List<User>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just an Affirmation object.
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textViewName: TextView = view.findViewById(R.id.item_textView)
        val textViewAge: TextView = view.findViewById(R.id.item_textView2)
        val image : ImageView = view.findViewById(R.id.imageView)

        val btn: Button = view.findViewById(R.id.button)
    }

    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val userInfo = dataset[position]
        holder.textViewName.text = userInfo.name.toString()
        holder.textViewAge.text = userInfo.age.toString()
        holder.image.setImageResource(userInfo.img)

        holder.btn.setOnClickListener {
            val intent = Intent(context, MainActivity2::class.java)
            intent.putExtra("name_user",userInfo.name)
            intent.putExtra("age_user",userInfo.age)
            intent.putExtra("img_user",userInfo.img)
            context.startActivity(intent)
        }
    }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
    override fun getItemCount() = dataset.size
}