/*
 * jegroupware - Egroupware Java Client
 * this is a java http/https egroupware client, for use please check the example
 *
 * @link https://www.hw-softwareentwicklung.de
 * @author Stefan Werfling <stefan.werfling-AT-hw-softwareentwicklung.de>
 * @package jegroupware
 * @copyright (c) 2012-17 by Stefan Werfling <stefan.werfling-AT-hw-softwareentwicklung.de>
 * @license http://opensource.org/licenses/GPL-2.0 GPL2 - GNU General Public License, version 2 (GPL-2.0)
 * @version 17.1
 */
package com.jegroupware.egroupware.exceptions;

/**
 * EgroupwareExceptionResponseEmpty
 * @author Stefan Werfling
 */
public class EgroupwareExceptionResponseEmpty extends Exception {

    /**
     * URL
     */
    protected String _url = "";

    /**
     * constructor
     * @param url
     */
    public EgroupwareExceptionResponseEmpty(String url) {
        super("egroupware server response empty url: " + url);
        this._url = url;
    }

    /**
     * getUrl
     * @return
     */
    public String getUrl() {
        return this._url;
    }
}
