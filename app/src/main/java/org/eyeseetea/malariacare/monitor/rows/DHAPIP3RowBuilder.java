/*
 * Copyright (c) 2015.
 *
 * This file is part of QIS Surveillance App.
 *
 *  QIS Surveillance App is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  QIS Surveillance App is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with QIS Surveillance App.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.eyeseetea.malariacare.monitor.rows;

import android.content.Context;

import org.eyeseetea.malariacare.R;
import org.eyeseetea.malariacare.database.model.Survey;
import org.eyeseetea.malariacare.monitor.utils.SurveyMonitor;

/**
 * Created by arrizabalaga on 26/02/16.
 */
public class DHAPIP3RowBuilder extends CounterRowBuilder {

    public DHAPIP3RowBuilder(Context context){
        super(context, context.getString(R.string.monitor_row_title_dhapip3));
    }

    @Override
    protected boolean hasToIncrement(SurveyMonitor surveyMonitor) {
        return surveyMonitor.isDHAPIP3Or4();
    }
}
