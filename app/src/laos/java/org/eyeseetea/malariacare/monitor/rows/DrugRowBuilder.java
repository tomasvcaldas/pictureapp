package org.eyeseetea.malariacare.monitor.rows;

import android.content.Context;

import org.eyeseetea.malariacare.R;
import org.eyeseetea.malariacare.monitor.utils.SurveyMonitor;

/**
 * Created by idelcano on 21/07/2016.
 */
public class DrugRowBuilder  extends CounterRowBuilder {
    public DrugRowBuilder(Context context){
        super(context, context.getString(R.string.monitor_row_title_drug));
    }

    @Override
    protected boolean hasToIncrement(SurveyMonitor surveyMonitor) {
        return surveyMonitor.isDrug();
    }
}
