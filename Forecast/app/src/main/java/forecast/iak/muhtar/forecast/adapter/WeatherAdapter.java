package forecast.iak.muhtar.forecast.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import forecast.iak.muhtar.forecast.R;
import forecast.iak.muhtar.forecast.model.Weather;

/**
 * Created by Muhtar on 12/05/2017.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {
    private Context context;
    private List<Weather> weatherList;

    public WeatherAdapter(Context context, List<Weather> weatherList) {
        this.context = context;
        this.weatherList = weatherList;
    }

    @Override
    public WeatherAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row_weather, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(WeatherAdapter.ViewHolder holder, int position) {
        Weather weather = weatherList.get(position);
        holder.tvDt.setText(weather.getDt());
        holder.tvDay.setText(weather.getDay());
        holder.tvMain.setText(weather.getMain());
    }

    @Override
    public int getItemCount() {
        return weatherList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvDt;
        TextView tvDay;
        TextView tvMain;

        public ViewHolder(View itemView) {
            super(itemView);

            tvDt = (TextView) itemView.findViewById(R.id.tv_dt);
            tvDay = (TextView) itemView.findViewById(R.id.tv_temp);
            tvMain = (TextView) itemView.findViewById(R.id.tv_main);

        }
    }
}

