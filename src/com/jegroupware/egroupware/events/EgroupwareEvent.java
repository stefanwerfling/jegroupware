/*
 * jegroupware - Egroupware Java Client
 * this is a java http/https egroupware client, for use please check the example
 *
 * @link https://www.hw-softwareentwicklung.de
 * @author Stefan Werfling <stefan.werfling-AT-hw-softwareentwicklung.de>
 * @package jegroupware
 * @copyright (c) 2012-15 by Stefan Werfling <stefan.werfling-AT-hw-softwareentwicklung.de>
 * @license http://opensource.org/licenses/GPL-2.0 GPL2 - GNU General Public License, version 2 (GPL-2.0)
 * @version 14.2.6
 */
package com.jegroupware.egroupware.events;

import com.jegroupware.egroupware.Egroupware;
import java.util.EventObject;

/**
 * EgroupwareEvent
 * @author Stefan Werfling
 */
public class EgroupwareEvent extends EventObject {

    /**
     * EgroupwareEvent
     * @param source
     */
    public EgroupwareEvent(Egroupware source) {
        super(source);
    }

    /**
     * getEgroupware
     * @return
     */
    public Egroupware getEgroupware() {
        return (Egroupware) this.getSource();
    }
}
