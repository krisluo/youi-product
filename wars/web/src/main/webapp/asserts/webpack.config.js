﻿const MiniCssExtractPlugin = require("mini-css-extract-plugin");
const OptimizeCssAssetsPlugin = require('optimize-css-assets-webpack-plugin');//压缩css插件

module.exports = {
    entry: {
        'app':[
            "./js/youi/extra/youi.treepage.js",
            "./js/youi/extra/youi.sheet.js",
            "./css/youi/youi.core.css",
            "./css/youi/youi.awesome.css",
            "./css/youi/youi.icon.css",
            "./css/youi/youi.form.css",
            "./css/youi/youi.field.css",
            "./css/youi/youi.field.cron.css",
            "./css/youi/youi.datepicker.css",
            "./css/youi/youi.toolbar.css",
            "./css/youi/youi.tree.css",
            "./css/youi/youi.grid.css",
            "./css/youi/youi.xmenu.css",
        ]
    },
    output: {
        path: __dirname,
        filename: "js/lib/[name]-1.0.min.js"
    },
    optimization: {
        splitChunks: {
            cacheGroups: {
                styles: {
                    name: 'app',
                    test: /\.css$/,
                    chunks: 'all',
                    enforce: true
                }
            }
        }
    },
    plugins: [
        new MiniCssExtractPlugin({
            filename: "css/[name]-1.0.min.css",
        }),
        new OptimizeCssAssetsPlugin()
    ],
    module: {
        rules: [
            {
                test: /\.css$/,
                use: [
                    MiniCssExtractPlugin.loader,
                    "css-loader"
                ]
            },
            {
                test:/\.(jpg|png|gif)$/,
                use:[{
                    loader:"url-loader",
                    options:{
                        limit:50,
                        outputPath:"css/images",
                        publicPath:"images"
                    }
                }]
            }
        ]
    }
}